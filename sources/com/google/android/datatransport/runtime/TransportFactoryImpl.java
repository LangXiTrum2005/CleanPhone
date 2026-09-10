package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class TransportFactoryImpl implements TransportFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f16836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportContext f16837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransportRuntime f16838c;

    public TransportFactoryImpl(Set set, TransportContext transportContext, TransportRuntime transportRuntime) {
        this.f16836a = set;
        this.f16837b = transportContext;
        this.f16838c = transportRuntime;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final Transport a(String str, Encoding encoding, Transformer transformer) {
        Set set = this.f16836a;
        if (!set.contains(encoding)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, set));
        }
        return new TransportImpl(this.f16837b, str, encoding, transformer, this.f16838c);
    }
}
