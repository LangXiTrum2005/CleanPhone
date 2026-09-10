package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class f extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f39420i = false;
    boolean j = false;
    com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a k;

    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, c.a aVar2) {
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
        this.k = new com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a(context, fVar, aVar, i2, relativeLayout, view, aVar2);
    }

    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        int i3;
        int i4;
        if (i2 == 107 || i2 == 108) {
            if (this.f39414e == 1) {
                a();
                return;
            }
            return;
        }
        if (i2 == 110) {
            com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a aVar = this.k;
            if (aVar != null) {
                if (this.j || (i3 = this.f39414e) == 1 || i3 == 2) {
                    aVar.c();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 111) {
            com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a aVar2 = this.k;
            if (aVar2 != null) {
                if (this.j || (i4 = this.f39414e) == 1 || i4 == 2) {
                    aVar2.b();
                    return;
                }
                return;
            }
            return;
        }
        if (i2 == 113) {
            this.f39420i = true;
            a();
            return;
        }
        if (i2 != 114) {
            if (i2 != 119) {
                return;
            }
            a();
        } else {
            this.j = true;
            com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a aVar3 = this.k;
            if (aVar3 != null) {
                aVar3.a(map);
                this.k.c();
            }
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
        com.smartdigimkt.sdk.basead.ui.guidetoclickv2.a aVar = this.k;
        if (aVar != null) {
            aVar.d();
            this.k = null;
        }
    }
}
