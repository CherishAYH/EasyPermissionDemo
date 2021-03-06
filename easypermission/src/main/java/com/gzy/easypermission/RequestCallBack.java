package com.gzy.easypermission;

/**
 * 权限申请结果返回接口
 *
 * @author gaozongyang
 * @date 2019/1/22
 */
public interface RequestCallBack {
    /**
     * 同意授权
     */
    void granted();

    /**
     * 拒绝授权
     */
    void denied();
}