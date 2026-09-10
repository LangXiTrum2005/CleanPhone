package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f9733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f9734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected SpannedString f9735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected SpannedString f9736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f9737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f9738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f9739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f9740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f9741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f9742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f9743k;
    protected int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f9744m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c f9745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f9746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SpannedString f9747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        SpannedString f9748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f9749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f9750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9751g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f9752h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f9753i = -16777216;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f9754j = -16777216;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f9755k = 0;
        int l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f9756m;

        public b(c cVar) {
            this.f9745a = cVar;
        }

        public b a(boolean z10) {
            this.f9746b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f9747c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f9748d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f9749e = str;
            return this;
        }

        public b a(String str) {
            this.f9750f = str;
            return this;
        }

        public b b(int i10) {
            this.l = i10;
            return this;
        }

        public b c(int i10) {
            this.f9754j = i10;
            return this;
        }

        public b d(int i10) {
            this.f9753i = i10;
            return this;
        }

        public b a(int i10) {
            this.f9752h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f9756m = z10;
            return this;
        }

        public b a(Context context) {
            this.f9752h = R.drawable.applovin_ic_disclosure_arrow;
            this.l = context.getColor(R.color.applovin_sdk_disclosureButtonColor);
            return this;
        }

        public t2 a() {
            int i10;
            if (this.f9746b && (i10 = this.f9752h) != 0 && i10 != R.drawable.applovin_ic_disclosure_arrow) {
                this.f9753i = -16776961;
            }
            return new t2(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9764a;

        c(int i10) {
            this.f9764a = i10;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            return this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f9764a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f9738f;
    }

    public String c() {
        return this.f9737e;
    }

    public int d() {
        return this.f9740h;
    }

    public int e() {
        return this.l;
    }

    public SpannedString f() {
        return this.f9736d;
    }

    public int g() {
        return this.f9742j;
    }

    public int h() {
        return this.f9739g;
    }

    public int i() {
        return this.f9743k;
    }

    public int j() {
        return this.f9733a.b();
    }

    public SpannedString k() {
        return this.f9735c;
    }

    public int l() {
        return this.f9741i;
    }

    public int m() {
        return this.f9733a.c();
    }

    public boolean o() {
        return this.f9734b;
    }

    public boolean p() {
        return this.f9744m;
    }

    public t2(c cVar) {
        this.f9739g = 0;
        this.f9740h = 0;
        this.f9741i = -16777216;
        this.f9742j = -16777216;
        this.f9743k = 0;
        this.l = 0;
        this.f9733a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private t2(b bVar) {
        this.f9739g = 0;
        this.f9740h = 0;
        this.f9741i = -16777216;
        this.f9742j = -16777216;
        this.f9743k = 0;
        this.l = 0;
        this.f9733a = bVar.f9745a;
        this.f9734b = bVar.f9746b;
        this.f9735c = bVar.f9747c;
        this.f9736d = bVar.f9748d;
        this.f9737e = bVar.f9749e;
        this.f9738f = bVar.f9750f;
        this.f9739g = bVar.f9751g;
        this.f9740h = bVar.f9752h;
        this.f9741i = bVar.f9753i;
        this.f9742j = bVar.f9754j;
        this.f9743k = bVar.f9755k;
        this.l = bVar.l;
        this.f9744m = bVar.f9756m;
    }
}
