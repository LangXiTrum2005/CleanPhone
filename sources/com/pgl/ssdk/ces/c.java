package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import com.pgl.ssdk.k0;
import com.pgl.ssdk.l0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2430a;
    private String b;
    private Map<String, Object> c;

    public c(Context context, String str, Map<String, Object> map) {
        this.f2430a = context;
        this.b = str;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] bArr = (byte[]) a.meta(EnumC4719u30.INVALID_WATERFALL_PLACEMENT_ID_VALUE, this.f2430a, new Object[]{this.b, this.c});
            if (bArr == null || bArr.length <= 0 || TextUtils.isEmpty(l0.a())) {
                return;
            }
            new k0(this.f2430a, null).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
