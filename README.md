# EasyPermissionDemo
封装 Android 6.0 动态权限申请

使用：
1.项目根build.gradle添加私有仓库地址
```
allprojects {
    repositories {
        google()
        jcenter()
        // 添加私有仓库
        maven { url "https://dl.bintray.com/gzy/maven" }
    }
}
```
2.项目下build.gradle添加依赖
```
dependencies {
    implementation 'com.gzy.www:easypermission:0.1.0'
}
```
3.开始使用
```
// 初始化待申请的权限集合
String[] permissions = new String[]{Manifest.permission.RECORD_AUDIO,
        Manifest.permission.ACCESS_NETWORK_STATE};
// 发起申请
PermissionUtil.requestPermission(this, permissions, new RequestCallBack() {
    @Override
    public void granted() {
        // 用户已授权
    }

    @Override
    public void denied() {
        // 用户已拒绝
    }
});

```
