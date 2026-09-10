package com.smartdigimkt.w5;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView;
import com.smartdigimkt.sdk.basead.ui.specialnote.ScreenSpecialNoteView;
import com.smartdigimkt.sdk.basead.ui.specialnote.SimpleSpecialNoteView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class k extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    BaseSpecialNoteView f39457i;
    private long j;
    private boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f39458l = false;

    public class a implements Runnable {
        final /* synthetic */ int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ long f39459Y;
        final /* synthetic */ long Z;

        /* JADX INFO: renamed from: com.smartdigimkt.w5.k$a$a, reason: collision with other inner class name */
        public class C0637a implements BaseSpecialNoteView.g {
            public C0637a() {
            }

            @Override // com.smartdigimkt.sdk.basead.ui.specialnote.BaseSpecialNoteView.g
            public void a(int i2) {
                c.a aVar = k.this.f39415h;
                if (aVar != null) {
                    aVar.a(i2, 4);
                }
            }
        }

        public a(int i2, long j, long j2) {
            this.X = i2;
            this.f39459Y = j;
            this.Z = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSpecialNoteView baseSpecialNoteView = k.this.f39457i;
            if (baseSpecialNoteView != null) {
                if (baseSpecialNoteView.getParent() == null) {
                    k kVar = k.this;
                    kVar.f39457i.initSetting(kVar.d, this.X, new C0637a(), this.f39459Y, this.Z);
                    k kVar2 = k.this;
                    kVar2.d.addView(kVar2.f39457i);
                    return;
                }
                if (this.X == 7) {
                    k kVar3 = k.this;
                    if (!com.smartdigimkt.m3.i.g(kVar3.f39412b, kVar3.f39413c) || k.this.f39457i.hasBeenShow()) {
                        return;
                    }
                    k.this.f39457i.pause();
                    k.this.f39457i.reset(this.X, this.f39459Y, this.Z);
                    k.this.f39457i.resume();
                }
            }
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, c.a aVar2) {
        com.smartdigimkt.w6.g gVar;
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
        int i3 = this.f39414e;
        if (i3 == 4 || i3 == 5 || i3 == 6) {
            this.f39457i = new SimpleSpecialNoteView(this.f39411a);
        } else {
            this.f39457i = new ScreenSpecialNoteView(this.f39411a);
        }
        com.smartdigimkt.v6.a aVar3 = this.f39413c;
        if (aVar3 == null || !String.valueOf(aVar3.f39164b).equals("4") || (gVar = this.f39413c.t) == null) {
            return;
        }
        this.j = gVar.z1();
    }

    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        if (i2 == 102) {
            this.f39458l = true;
            return;
        }
        if (i2 == 103) {
            if (!a(map) && com.smartdigimkt.m3.i.g(this.f39412b, this.f39413c)) {
                a(7);
                return;
            }
            return;
        }
        if (i2 != 119) {
            switch (i2) {
                case 112:
                    break;
                case 113:
                    this.k = true;
                    break;
                case 114:
                    if (com.smartdigimkt.m3.i.g(this.f39412b, this.f39413c)) {
                        if (this.f39414e != 1) {
                            a(6);
                            return;
                        } else {
                            if (this.f39458l) {
                                return;
                            }
                            a(6);
                            return;
                        }
                    }
                    a(5);
                    return;
                default:
                    return;
            }
            a();
            return;
        }
        a();
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
        BaseSpecialNoteView baseSpecialNoteView = this.f39457i;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.release();
        }
    }

    public void a(int i2) {
        long jX1;
        long jW1;
        if (this.f39412b.w0() || this.k || this.f39457i == null) {
            return;
        }
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7 || !this.f39413c.t.u1()) {
                    return;
                }
                jX1 = this.f39413c.t.t1();
                jW1 = this.f39413c.t.s1();
            } else {
                if (!this.f39413c.t.y1()) {
                    return;
                }
                jX1 = this.f39413c.t.x1();
                jW1 = this.f39413c.t.w1();
            }
        } else {
            if (!this.f39413c.t.v1()) {
                return;
            }
            jX1 = this.f39413c.t.x1();
            jW1 = this.f39413c.t.w1();
        }
        long j = this.j;
        long j2 = 0;
        if (j <= 0 || j >= jX1 + jW1 + 1000) {
            j2 = jX1;
        } else if (jW1 + 1000 >= j) {
            jW1 = j - 1000;
        } else {
            jX1 = (j - jW1) - 1000;
            j2 = jX1;
        }
        a(i2, j2, jW1);
    }

    private void a(int i2, long j, long j2) {
        if (j >= 0 && j2 >= 0) {
            com.smartdigimkt.l7.b.a().e(new a(i2, j, j2));
        }
    }

    public void a(ViewGroup.LayoutParams layoutParams) {
        BaseSpecialNoteView baseSpecialNoteView = this.f39457i;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.setLayoutParams(layoutParams);
        }
    }

    public void a(long j) {
        com.smartdigimkt.v6.a aVar = this.f39413c;
        if (aVar == null || TextUtils.equals(String.valueOf(aVar.f39164b), "4")) {
            return;
        }
        this.j = j;
    }
}
