package com.google.firebase.encoders.json;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements ObjectEncoder {
    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void a(Object obj, Object obj2) {
        a aVar = JsonDataEncoderBuilder.f20786e;
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }
}
