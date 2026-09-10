package com.smartdigimkt.w5;

import android.content.Context;
import android.hardware.SensorEvent;
import com.smartdigimkt.sdk.basead.ui.ShakeNativeBorderThumbView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    private static volatile i o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f39437a = com.smartdigimkt.q8.i.f37957c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f39438b = new Object();
    private boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39440e = 148;
    private final int f = 50;
    private int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f39441h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39442i = 0;
    private int j = 0;
    private float k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f39443l = 0.0f;
    private float m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    com.smartdigimkt.v3.d f39444n = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<c> f39439c = new ArrayList();

    public class a extends com.smartdigimkt.v3.d {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0020  */
        @Override // com.smartdigimkt.v3.d
        public boolean a(SensorEvent sensorEvent) {
            float f;
            float f2;
            float f3;
            synchronized (i.this.f39438b) {
                if (sensorEvent != null) {
                    try {
                        float[] fArr = sensorEvent.values;
                        if (fArr == null || fArr.length < 3) {
                            f3 = 0.0f;
                            f = 0.0f;
                            f2 = 0.0f;
                        } else {
                            f = -fArr[0];
                            f2 = -fArr[1];
                            f3 = -fArr[2];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    f3 = 0.0f;
                    f = 0.0f;
                    f2 = 0.0f;
                }
                if (!(i.this.k == 0.0f && i.this.f39443l == 0.0f && i.this.m == 0.0f) && Math.abs(f - i.this.k) + Math.abs(f2 - i.this.f39443l) + Math.abs(f3 - i.this.m) < 0.5d) {
                    return false;
                }
                i.this.k = f;
                i.this.f39443l = f2;
                i.this.m = f3;
                if (!i.this.d) {
                    String unused = i.this.f39437a;
                    return false;
                }
                ArrayList<b> arrayList = new ArrayList();
                for (c cVar : i.this.f39439c) {
                    arrayList.add(i.this.new b(cVar.b(), cVar));
                }
                Collections.sort(arrayList);
                for (b bVar : arrayList) {
                    if (bVar.f39447b.a().a(sensorEvent)) {
                        String unused2 = i.this.f39437a;
                        bVar.f39447b.hashCode();
                        i.this.d = false;
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f39447b;

        public b(int i2, c cVar) {
            this.f39446a = i2;
            this.f39447b = cVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof b) {
                return this.f39446a - ((b) obj).f39446a;
            }
            return 0;
        }
    }

    public interface c {
        ShakeNativeBorderThumbView.d a();

        int b();
    }

    public void d() {
        synchronized (this.f39438b) {
            this.d = true;
        }
    }

    public void b(c cVar) {
        synchronized (this.f39438b) {
            try {
                this.f39439c.remove(cVar);
                cVar.hashCode();
                this.f39439c.size();
                if (this.f39439c.size() == 0) {
                    com.smartdigimkt.t4.a.a().b(this.f39444n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int c() {
        if (this.f39442i == 0) {
            this.f39442i = com.smartdigimkt.n8.c.j(com.smartdigimkt.m6.b.p().k());
        }
        return this.f39442i;
    }

    public static i a() {
        if (o == null) {
            synchronized (i.class) {
                try {
                    if (o == null) {
                        o = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public int b(Context context) {
        if (this.g == 0) {
            this.g = com.smartdigimkt.n8.h.a(context, 148.0f);
        }
        return this.g;
    }

    public void a(c cVar) {
        synchronized (this.f39438b) {
            try {
                if (this.f39439c.contains(cVar)) {
                    return;
                }
                this.f39439c.add(cVar);
                cVar.hashCode();
                this.f39439c.size();
                if (this.f39439c.size() == 1) {
                    this.d = true;
                    com.smartdigimkt.t4.a.a().a(this.f39444n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int b() {
        if (this.j == 0) {
            this.j = com.smartdigimkt.n8.c.i(com.smartdigimkt.m6.b.p().k());
        }
        return this.j;
    }

    public int a(Context context) {
        if (this.f39441h == 0) {
            this.f39441h = com.smartdigimkt.n8.h.a(context, 50.0f);
        }
        return this.f39441h;
    }
}
