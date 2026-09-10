package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class J5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f26337e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0477n7 f26338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private D5 f26339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private G7 f26340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f26341d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26342a;

        public a(String str) {
            this.f26342a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Pd pd2 = new Pd();
                ArrayList<Pair<String, String>> arrayListD = J5.this.f26339b.d();
                if (C0375hc.f28789b.equals(J5.this.f26339b.e())) {
                    pd2 = C0281c8.b(J5.this.f26339b.b(), this.f26342a, arrayListD);
                } else if (C0375hc.f28788a.equals(J5.this.f26339b.e())) {
                    pd2 = C0281c8.a(J5.this.f26339b.b(), this.f26342a, arrayListD);
                }
                J5.this.a("response status code: " + pd2.f27043a);
            } catch (Exception e10) {
                C0474n4.d().a(e10);
            }
        }
    }

    public J5(D5 d10, InterfaceC0477n7 interfaceC0477n7) {
        if (d10 == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (d10.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f26339b = d10;
        this.f26338a = interfaceC0477n7;
        this.f26340c = d10.c();
        this.f26341d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.f26341d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        a(wi.d.i(str, " ", map.toString()));
        if (this.f26339b.a() && !str.isEmpty()) {
            HashMap mapN = com.applovin.impl.ca.n("eventname", str);
            a(mapN, this.f26338a.a());
            a(mapN, map);
            b(this.f26340c.a(mapN));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f26339b.f()) {
            Log.d(f26337e, str);
        }
    }
}
