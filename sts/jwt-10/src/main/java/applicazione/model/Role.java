package applicazione.model;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static applicazione.model.Permission.ADMIN_READ;
import static applicazione.model.Permission.ADMIN_UPDATE;
import static applicazione.model.Permission.ADMIN_DELETE;
import static applicazione.model.Permission.ADMIN_CREATE;
import static applicazione.model.Permission.MANAGER_READ;
import static applicazione.model.Permission.MANAGER_UPDATE;
import static applicazione.model.Permission.MANAGER_DELETE;
import static applicazione.model.Permission.MANAGER_CREATE;


import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum Role {
	USER(Collections.emptySet()), 
	ADMIN(Set.of(
			ADMIN_READ, 
			ADMIN_UPDATE, 
			ADMIN_DELETE, 
			ADMIN_CREATE, 
			MANAGER_READ,
			MANAGER_UPDATE, 
			MANAGER_DELETE, 
			MANAGER_CREATE)
			),
	MANAGER(Set.of(
			MANAGER_READ, 
			MANAGER_UPDATE, 
			MANAGER_DELETE, 
			MANAGER_CREATE)
			)

	;

	/**
	 * @param permissions
	 */
	private Role(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	private final Set<Permission> permissions;

	public List<SimpleGrantedAuthority> getAuthorities() {
		var authorities = getPermissions().stream()
				.map(permission -> new SimpleGrantedAuthority(permission.getPermission())).collect(Collectors.toList());
		authorities.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
		return authorities;
	}

	/**
	 * @return the permissions
	 */
	public Set<Permission> getPermissions() {
		return permissions;
	}
}
