package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h12 extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15059b;

    public /* synthetic */ h12(Object obj, int i10) {
        this.f15058a = i10;
        this.f15059b = obj;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        switch (this.f15058a) {
            case 0:
                mk0 mk0Var = ((j12) ((ay0) this.f15059b).f12539d).f15925i;
                mk0Var.i(-1, b02.f12589f);
                mk0Var.j();
                break;
            default:
                ((r1.t) ((r1.s) this.f15059b).f49340d).f49352i.e(-1, new r1.q(1));
                break;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.f15058a) {
            case 0:
                mk0 mk0Var = ((j12) ((ay0) this.f15059b).f12539d).f15925i;
                mk0Var.i(-1, b02.f12587d);
                mk0Var.j();
                break;
            default:
                ((r1.t) ((r1.s) this.f15059b).f49340d).f49352i.e(-1, new r1.q(2));
                break;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        switch (this.f15058a) {
            case 0:
                mk0 mk0Var = ((j12) ((ay0) this.f15059b).f12539d).f15925i;
                mk0Var.i(-1, b02.f12588e);
                mk0Var.j();
                break;
            default:
                ((r1.t) ((r1.s) this.f15059b).f49340d).f49352i.e(-1, new r1.q(1));
                break;
        }
    }
}
