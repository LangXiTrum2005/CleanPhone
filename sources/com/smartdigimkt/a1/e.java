package com.smartdigimkt.a1;

import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class e implements c {
    private static final String d = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f33591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.n1.c f33592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33593c = false;

    public e(c cVar, com.smartdigimkt.n1.c cVar2) {
        this.f33592b = cVar2;
        this.f33591a = cVar;
    }

    @Override // com.smartdigimkt.a1.c
    public void a(List<com.smartdigimkt.x.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f33593c = a(this.f33592b, list.get(0).D2());
                }
            } catch (Exception unused) {
            }
        }
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.a(list);
        }
    }

    @Override // com.smartdigimkt.a1.c
    public void closeFullScreen() {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.closeFullScreen();
        }
    }

    @Override // com.smartdigimkt.a1.c
    public void onClick(com.smartdigimkt.x.d dVar) {
        c cVar = this.f33591a;
        if (cVar == null || this.f33593c) {
            return;
        }
        cVar.onClick(dVar);
    }

    @Override // com.smartdigimkt.a1.c
    public void onCloseBanner() {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.onCloseBanner();
        }
    }

    @Override // com.smartdigimkt.a1.c
    public void onLeaveApp() {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.onLeaveApp();
        }
    }

    @Override // com.smartdigimkt.a1.c
    public void onShowFailed(String str) {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.onShowFailed(str);
        }
    }

    @Override // com.smartdigimkt.a1.c
    public void showFullScreen() {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.showFullScreen();
        }
    }

    @Override // com.smartdigimkt.a1.c
    public void a(com.smartdigimkt.x.d dVar, boolean z2) {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.a(dVar, this.f33593c);
        }
    }

    private boolean a(com.smartdigimkt.n1.c cVar, boolean z2) {
        if (z2 || cVar == null || cVar.h() == 1.0d) {
            return false;
        }
        return new Random().nextDouble() > cVar.h();
    }

    @Override // com.smartdigimkt.a1.c
    public void a(boolean z2) {
        c cVar = this.f33591a;
        if (cVar != null) {
            cVar.a(z2);
        }
    }
}
