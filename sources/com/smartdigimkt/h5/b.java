package com.smartdigimkt.h5;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.smartdigimkt.sdk.basead.ui.MraidBannerATView;
import com.smartdigimkt.sdk.basead.ui.SdkBannerATView;

/* JADX INFO: loaded from: classes5.dex */
public class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f35661i;
    com.smartdigimkt.f5.a j;

    public b(Context context, com.smartdigimkt.v6.a aVar, String str, boolean z2) {
        super(context, aVar, str, z2);
        this.f35661i = getClass().getSimpleName();
    }

    @Override // com.smartdigimkt.h5.a
    public void a(Activity activity) {
    }

    @Override // com.smartdigimkt.h5.c
    public void c() {
        this.j = null;
    }

    public View h() {
        if (isReady()) {
            return this.f.v0() ? new MraidBannerATView(this.f35664b, this.f35665c, this.f, this.j) : new SdkBannerATView(this.f35664b, this.f35665c, this.f, this.j);
        }
        return null;
    }

    public void a(com.smartdigimkt.f5.a aVar) {
        this.j = aVar;
    }
}
