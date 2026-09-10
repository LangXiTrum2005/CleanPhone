package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* JADX INFO: loaded from: classes4.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20814a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20815b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FieldDescriptor f20816c;
    public final ProtobufDataEncoderContext d;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.d = protobufDataEncoderContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext e(String str) {
        if (this.f20814a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20814a = true;
        this.d.i(this.f20816c, str, this.f20815b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext g(boolean z2) {
        if (this.f20814a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f20814a = true;
        this.d.g(this.f20816c, z2 ? 1 : 0, this.f20815b);
        return this;
    }
}
