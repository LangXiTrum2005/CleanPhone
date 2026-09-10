package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC1188Yq extends QS {
    void A5n();

    void A6B(C0986Ql c0986Ql, ZM[] zmArr, InterfaceC1309bV interfaceC1309bV, long j, boolean z, boolean z2, long j2, long j3) throws EK;

    InterfaceC0983Qi A73();

    PD A8J();

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    MI A8z();

    int A90();

    InterfaceC1309bV A93();

    int A9D();

    boolean A9f();

    void A9z(int i, RK rk);

    boolean AAC();

    boolean AAE();

    boolean AAT();

    void ABp() throws IOException;

    void AHd(long j, long j2) throws EK;

    void AHg(ZM[] zmArr, InterfaceC1309bV interfaceC1309bV, long j, long j2) throws EK;

    void AHs(long j) throws EK;

    void AIT();

    String getName();

    void start() throws EK;

    void stop();
}
