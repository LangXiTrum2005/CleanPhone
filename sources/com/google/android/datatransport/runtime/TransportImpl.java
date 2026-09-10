package com.google.android.datatransport.runtime;

import android.support.v4.media.a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

/* JADX INFO: loaded from: classes3.dex */
final class TransportImpl<T> implements Transport<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportContext f16839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Encoding f16841c;
    public final Transformer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TransportRuntime f16842e;

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, TransportRuntime transportRuntime) {
        this.f16839a = transportContext;
        this.f16840b = str;
        this.f16841c = encoding;
        this.d = transformer;
        this.f16842e = transportRuntime;
    }

    @Override // com.google.android.datatransport.Transport
    public final void a(Event event, TransportScheduleCallback transportScheduleCallback) {
        AutoValue_SendRequest.Builder builder = new AutoValue_SendRequest.Builder();
        TransportContext transportContext = this.f16839a;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        builder.f16820a = transportContext;
        builder.f16822c = event;
        builder.f16821b = this.f16840b;
        Transformer transformer = this.d;
        if (transformer == null) {
            throw new NullPointerException("Null transformer");
        }
        builder.d = transformer;
        builder.f16823e = this.f16841c;
        String strM = builder.f16823e == null ? a.m("", " encoding") : "";
        if (!strM.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
        TransportContext transportContext2 = builder.f16820a;
        String str = builder.f16821b;
        Event event2 = builder.f16822c;
        Transformer transformer2 = builder.d;
        Encoding encoding = builder.f16823e;
        TransportRuntime transportRuntime = this.f16842e;
        TransportContext transportContextE = transportContext2.e(event2.d());
        AutoValue_EventInternal.Builder builder2 = (AutoValue_EventInternal.Builder) EventInternal.a();
        builder2.d = Long.valueOf(transportRuntime.f16844a.a());
        builder2.f16817e = Long.valueOf(transportRuntime.f16845b.a());
        builder2.k(str);
        builder2.f16816c = new EncodedPayload(encoding, (byte[]) transformer2.apply(event2.c()));
        builder2.f16815b = event2.a();
        if (event2.e() != null) {
            event2.e().getClass();
        }
        if (event2.b() != null) {
            event2.b().getClass();
        }
        transportRuntime.f16846c.a(transportContextE, builder2.b(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public final void b(Event event) {
        a(event, new androidx.media3.extractor.text.a(26));
    }
}
