package com.umeng.ccg;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f2617a = null;
    public static final int b = 101;
    public static final int c = 102;
    public static final int d = 103;
    public static final int e = 104;
    public static final int f = 105;
    public static final int g = 106;
    public static final int h = 107;
    public static final int i = 0;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 201;
    public static final int m = 202;
    public static final int n = 203;
    public static final int o = 301;
    public static final int p = 302;
    public static final int q = 303;
    public static final int r = 304;
    public static final int s = 305;
    private static HandlerThread t = null;
    private static HashMap<Integer, a> u = null;
    private static final int v = 256;

    public interface a {
        void a(Object obj, int i);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        int i2 = message.arg1;
        Object obj = message.obj;
        Integer numValueOf = Integer.valueOf(i2 / 100);
        HashMap<Integer, a> map = u;
        if (map == null) {
            return;
        }
        a aVar = map.containsKey(numValueOf) ? u.get(numValueOf) : null;
        if (aVar != null) {
            aVar.a(obj, i2);
        }
    }

    public static void a(Context context, int i2, int i3, a aVar, Object obj, long j2) {
        if (context == null || aVar == null) {
            return;
        }
        if (u == null) {
            u = new HashMap<>();
        }
        Integer numValueOf = Integer.valueOf(i3 / 100);
        if (!u.containsKey(numValueOf)) {
            u.put(numValueOf, aVar);
        }
        if (t == null || f2617a == null) {
            a();
        }
        try {
            Handler handler = f2617a;
            if (handler != null) {
                Message messageObtainMessage = handler.obtainMessage();
                messageObtainMessage.what = i2;
                messageObtainMessage.arg1 = i3;
                messageObtainMessage.obj = obj;
                f2617a.sendMessageDelayed(messageObtainMessage, j2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, int i2, a aVar, Object obj) {
        a(context, 256, i2, aVar, obj, 0L);
    }

    public static void a(Context context, int i2, a aVar, Object obj, long j2) {
        a(context, 256, i2, aVar, obj, j2);
    }

    private static synchronized void a() {
        try {
            if (t == null) {
                HandlerThread handlerThread = new HandlerThread("ccg_dispatch");
                t = handlerThread;
                handlerThread.start();
                if (f2617a == null) {
                    f2617a = new Handler(t.getLooper()) { // from class: com.umeng.ccg.c.1
                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            if (message.what != 256) {
                                return;
                            }
                            c.b(message);
                        }
                    };
                }
            }
        } catch (Throwable unused) {
        }
    }
}
