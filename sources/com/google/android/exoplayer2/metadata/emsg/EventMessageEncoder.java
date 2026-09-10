package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class EventMessageEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f18201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f18202b;

    public EventMessageEncoder() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f18201a = byteArrayOutputStream;
        this.f18202b = new DataOutputStream(byteArrayOutputStream);
    }
}
