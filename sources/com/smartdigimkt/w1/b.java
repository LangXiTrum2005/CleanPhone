package com.smartdigimkt.w1;

import android.content.Context;
import com.smartdigimkt.b.c;
import com.smartdigimkt.h0.n;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class b implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<String, String> f39196c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f39198b = false;

    private void a() {
        this.f39198b = false;
        try {
            n.a(this.f39197a);
            com.smartdigimkt.u.b.a().a(f39196c, this.f39197a);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.b.c
    public void a(Map<String, String> map, Context context) {
        this.f39197a = context.getApplicationContext();
        f39196c = map;
        a();
    }
}
