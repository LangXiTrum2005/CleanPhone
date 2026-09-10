package com.smartdigimkt.n5;

import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class c extends d {
    e r;

    public c(View view) {
        super(view);
        if (view == null) {
            return;
        }
        e eVar = new e(view);
        this.r = eVar;
        eVar.a(0.85f);
    }

    @Override // com.smartdigimkt.n5.d, com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void a(Canvas canvas) {
        super.a(canvas);
        e eVar = this.r;
        if (eVar != null) {
            eVar.a(canvas);
        }
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void pause() {
        super.pause();
        e eVar = this.r;
        if (eVar != null) {
            eVar.pause();
        }
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void resume() {
        super.resume();
        e eVar = this.r;
        if (eVar != null) {
            eVar.resume();
        }
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public synchronized void start() {
        super.start();
        e eVar = this.r;
        if (eVar != null) {
            eVar.start();
        }
    }

    @Override // com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void stop() {
        super.stop();
        e eVar = this.r;
        if (eVar != null) {
            eVar.stop();
        }
    }

    @Override // com.smartdigimkt.n5.d, com.smartdigimkt.n5.a, com.smartdigimkt.m5.b
    public void a(int i2, int i3) {
        super.a(i2, i3);
        e eVar = this.r;
        if (eVar != null) {
            eVar.a(i2, i3);
        }
    }
}
