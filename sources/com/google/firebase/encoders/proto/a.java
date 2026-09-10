package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20817a;

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void a(Object obj, Object obj2) {
        switch (this.f20817a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
                Charset charset = ProtobufDataEncoderContext.f;
                objectEncoderContext.f(ProtobufDataEncoderContext.g, entry.getKey());
                objectEncoderContext.f(ProtobufDataEncoderContext.f20801h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
