package com.yupi.ojcodesandbox.security;

import java.security.Permission;

/**
 * 默认安全管理器
 */
public class DefaultSecurityManager extends SecurityManager{
    // 检测所有的权限

    @Override
    public void checkPermission(Permission perm) {
//        System.out.println("默认不做任何限制");
    }
}
