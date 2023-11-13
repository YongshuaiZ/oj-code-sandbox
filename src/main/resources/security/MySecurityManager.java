import java.security.Permission;

public class MySecurityManager extends SecurityManager{

    @Override
    public void checkPermission(Permission perm) {
//       super.checkPermission(perm);
    }
    // 检测程序是否可执行
    @Override
    public void checkExec(String cmd) {
        throw new SecurityException("checkExec 权限异常： " + cmd);
    }

    // 检测程序是否可读文件
    @Override
    public void checkRead(String s) {
//        throw new SecurityException("checkRead 权限异常： " + s);
    }

    @Override
    public void checkWrite(String s) {
//        throw new SecurityException("checkWrite 权限异常： " + s);
    }

    @Override
    public void checkDelete(String s) {
//        throw new SecurityException("checkDelete 权限异常： " + s);
    }

    // 检测文件是否可连接网络
    @Override
    public void checkConnect(String s, int port) {
//        throw new SecurityException("checkConnect 权限异常： " + s + ":" + port);
    }
}
