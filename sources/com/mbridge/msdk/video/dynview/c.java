package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f37309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f37312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f37313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f37316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f37317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37319k;
    private List<String> l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f37321n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37322o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f37323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f37324q;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements InterfaceC0193c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f37325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f37328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f37329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f37330f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f37331g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f37332h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f37333i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f37334j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f37335k;
        private List<String> l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f37336m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f37337n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f37338o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f37339p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private String f37340q;

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public c build() {
            return new c(this);
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c fileDirs(List<String> list) {
            this.l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c orientation(int i10) {
            this.f37330f = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(Context context) {
            this.f37325a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c b(int i10) {
            this.f37327c = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c c(String str) {
            this.f37326b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c d(int i10) {
            this.f37336m = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c e(int i10) {
            this.f37339p = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c f(int i10) {
            this.f37338o = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(float f10) {
            this.f37329e = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c b(float f10) {
            this.f37328d = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c c(int i10) {
            this.f37331g = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(View view) {
            this.f37332h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c b(String str) {
            this.f37340q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(List<CampaignEx> list) {
            this.f37333i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(int i10) {
            this.f37334j = i10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(boolean z10) {
            this.f37335k = z10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.InterfaceC0193c
        public InterfaceC0193c a(String str) {
            this.f37337n = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0193c {
        InterfaceC0193c a(float f10);

        InterfaceC0193c a(int i10);

        InterfaceC0193c a(Context context);

        InterfaceC0193c a(View view);

        InterfaceC0193c a(String str);

        InterfaceC0193c a(List<CampaignEx> list);

        InterfaceC0193c a(boolean z10);

        InterfaceC0193c b(float f10);

        InterfaceC0193c b(int i10);

        InterfaceC0193c b(String str);

        c build();

        InterfaceC0193c c(int i10);

        InterfaceC0193c c(String str);

        InterfaceC0193c d(int i10);

        InterfaceC0193c e(int i10);

        InterfaceC0193c f(int i10);

        InterfaceC0193c fileDirs(List<String> list);

        InterfaceC0193c orientation(int i10);
    }

    public static b a() {
        return new b();
    }

    public List<CampaignEx> b() {
        return this.f37317i;
    }

    public Context c() {
        return this.f37309a;
    }

    public List<String> d() {
        return this.l;
    }

    public int e() {
        return this.f37322o;
    }

    public String f() {
        return this.f37310b;
    }

    public int g() {
        return this.f37311c;
    }

    public int h() {
        return this.f37314f;
    }

    public View i() {
        return this.f37316h;
    }

    public int j() {
        return this.f37315g;
    }

    public float k() {
        return this.f37312d;
    }

    public int l() {
        return this.f37318j;
    }

    public float m() {
        return this.f37313e;
    }

    public String n() {
        return this.f37324q;
    }

    public int o() {
        return this.f37323p;
    }

    public boolean p() {
        return this.f37319k;
    }

    private c(b bVar) {
        this.f37313e = bVar.f37329e;
        this.f37312d = bVar.f37328d;
        this.f37314f = bVar.f37330f;
        this.f37315g = bVar.f37331g;
        this.f37309a = bVar.f37325a;
        this.f37310b = bVar.f37326b;
        this.f37311c = bVar.f37327c;
        this.f37316h = bVar.f37332h;
        this.f37317i = bVar.f37333i;
        this.f37318j = bVar.f37334j;
        this.f37319k = bVar.f37335k;
        this.l = bVar.l;
        this.f37320m = bVar.f37336m;
        this.f37321n = bVar.f37337n;
        this.f37322o = bVar.f37338o;
        this.f37323p = bVar.f37339p;
        this.f37324q = bVar.f37340q;
    }
}
