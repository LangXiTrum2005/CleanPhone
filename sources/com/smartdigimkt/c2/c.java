package com.smartdigimkt.c2;

import android.content.Context;
import android.view.View;
import com.smartdigimkt.x.d;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34048c;
    private float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f34049e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f34050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<d> f34051i;
    private int j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<String> f34052l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34053n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f34054p;
    private String q;

    public static class b implements InterfaceC0448c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f34055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f34056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f34057c;
        private float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f34058e;
        private int f;
        private int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f34059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<d> f34060i;
        private int j;
        private boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<String> f34061l;
        private int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f34062n;
        private int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f34063p = 1;
        private String q;

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(Context context) {
            this.f34055a = context.getApplicationContext();
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c b(float f) {
            this.d = f;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c c(String str) {
            this.f34056b = str;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c d(int i2) {
            this.g = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c e(int i2) {
            this.m = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c f(int i2) {
            this.f34063p = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c g(int i2) {
            this.o = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(float f) {
            this.f34058e = f;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c b(int i2) {
            this.j = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c c(int i2) {
            this.f34057c = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(int i2) {
            this.f = i2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c b(List<String> list) {
            this.f34061l = list;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(View view) {
            this.f34059h = view;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c b(String str) {
            this.q = str;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(List<d> list) {
            this.f34060i = list;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(boolean z2) {
            this.k = z2;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public InterfaceC0448c a(String str) {
            this.f34062n = str;
            return this;
        }

        @Override // com.smartdigimkt.c2.c.InterfaceC0448c
        public c a() {
            return new c(this);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.c2.c$c, reason: collision with other inner class name */
    public interface InterfaceC0448c {
        InterfaceC0448c a(float f);

        InterfaceC0448c a(int i2);

        InterfaceC0448c a(Context context);

        InterfaceC0448c a(View view);

        InterfaceC0448c a(String str);

        InterfaceC0448c a(List<d> list);

        InterfaceC0448c a(boolean z2);

        c a();

        InterfaceC0448c b(float f);

        InterfaceC0448c b(int i2);

        InterfaceC0448c b(String str);

        InterfaceC0448c b(List<String> list);

        InterfaceC0448c c(int i2);

        InterfaceC0448c c(String str);

        InterfaceC0448c d(int i2);

        InterfaceC0448c e(int i2);

        InterfaceC0448c f(int i2);

        InterfaceC0448c g(int i2);
    }

    public static b a() {
        return new b();
    }

    public List<d> b() {
        return this.f34051i;
    }

    public Context c() {
        return this.f34046a;
    }

    public String d() {
        return this.f34053n;
    }

    public List<String> e() {
        return this.f34052l;
    }

    public int f() {
        return this.o;
    }

    public String g() {
        return this.f34047b;
    }

    public int h() {
        return this.f34048c;
    }

    public int i() {
        return this.f;
    }

    public View j() {
        return this.f34050h;
    }

    public int k() {
        return this.g;
    }

    public float l() {
        return this.d;
    }

    public int m() {
        return this.j;
    }

    public float n() {
        return this.f34049e;
    }

    public String o() {
        return this.q;
    }

    public int p() {
        return this.m;
    }

    public int q() {
        return this.f34054p;
    }

    public boolean r() {
        return this.k;
    }

    private c(b bVar) {
        this.f34049e = bVar.f34058e;
        this.d = bVar.d;
        this.f = bVar.f;
        this.g = bVar.g;
        this.f34046a = bVar.f34055a;
        this.f34047b = bVar.f34056b;
        this.f34048c = bVar.f34057c;
        this.f34050h = bVar.f34059h;
        this.f34051i = bVar.f34060i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.f34052l = bVar.f34061l;
        this.m = bVar.m;
        this.f34053n = bVar.f34062n;
    }
}
