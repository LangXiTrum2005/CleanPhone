package com.p004ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class lc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f25571e = "EventsTracker";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kf f25572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fc f25573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dg f25574c;
    private ExecutorService d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25575a;

        public a(String str) {
            this.f25575a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ir irVar = new ir();
                ArrayList<Pair<String, String>> arrayListD = lc.this.f25573b.d();
                if (ko.f25535b.equals(lc.this.f25573b.e())) {
                    irVar = zg.b(lc.this.f25573b.b(), this.f25575a, arrayListD);
                } else if (ko.f25534a.equals(lc.this.f25573b.e())) {
                    irVar = zg.a(lc.this.f25573b.b(), this.f25575a, arrayListD);
                }
                lc.this.a("response status code: " + irVar.f25367a);
            } catch (Exception e2) {
                q9.d().a(e2);
            }
        }
    }

    public lc(fc fcVar, kf kfVar) {
        if (fcVar == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (fcVar.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.f25573b = fcVar;
        this.f25572a = kfVar;
        this.f25574c = fcVar.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.f25573b.f()) {
            Log.d(f25571e, str);
        }
    }

    public void a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        a(android.support.v4.media.a.D(str, " ", map.toString()));
        if (this.f25573b.a() && !str.isEmpty()) {
            HashMap mapS = androidx.media3.extractor.text.ttml.a.s("eventname", str);
            a(mapS, this.f25572a.a());
            a(mapS, map);
            b(this.f25574c.a(mapS));
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            q9.d().a(e2);
        }
    }
}
