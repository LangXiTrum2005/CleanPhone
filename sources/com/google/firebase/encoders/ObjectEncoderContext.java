package com.google.firebase.encoders;

/* JADX INFO: loaded from: classes4.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext a(FieldDescriptor fieldDescriptor, boolean z2);

    ObjectEncoderContext b(FieldDescriptor fieldDescriptor, long j);

    ObjectEncoderContext c(FieldDescriptor fieldDescriptor, int i2);

    ObjectEncoderContext d(FieldDescriptor fieldDescriptor, double d);

    ObjectEncoderContext f(FieldDescriptor fieldDescriptor, Object obj);
}
