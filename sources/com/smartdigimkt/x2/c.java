package com.smartdigimkt.x2;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.f1.q;

/* JADX INFO: loaded from: classes6.dex */
public interface c extends d {
    public static final int v = 2;

    public interface a extends q.c {
        void a();

        void a(int i2, String str);

        void a(com.smartdigimkt.x.d dVar, boolean z2);

        void b();
    }

    void a();

    void a(int i2);

    void a(int i2, String str);

    void a(Context context);

    void a(a aVar);

    void a(String str);

    void a(boolean z2);

    void b(int i2);

    void b(boolean z2);

    boolean b();

    int c();

    void c(int i2);

    String d();

    void d(int i2);

    int e();

    void e(int i2);

    int f();

    String f(int i2);

    String g();

    void g(int i2);

    int getH5CloseType();

    int getH5MuteState();

    void h();

    int i();

    boolean j();

    int k();

    void release();

    void setActivity(Activity activity);

    void setH5Cbp(int i2);

    void setRewardUnitSetting(com.smartdigimkt.f3.d dVar);

    void setUnitId(String str);

    void setWebViewFront(int i2);
}
