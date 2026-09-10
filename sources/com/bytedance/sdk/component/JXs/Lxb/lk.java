package com.bytedance.sdk.component.JXs.Lxb;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static final TimeUnit Lxb = TimeUnit.SECONDS;

    public static ExecutorService Lxb() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, Lxb, new LinkedBlockingQueue(), new Lxb(MRAIDCommunicatorUtil.STATES_DEFAULT));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
