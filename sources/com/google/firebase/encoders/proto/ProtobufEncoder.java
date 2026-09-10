package com.google.firebase.encoders.proto;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ProtobufEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20810c;

    public static final class Builder implements EncoderConfig<Builder> {
        public static final a d = new a(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f20811a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f20812b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f20813c = d;

        public final EncoderConfig a(Class cls, ObjectEncoder objectEncoder) {
            this.f20811a.put(cls, objectEncoder);
            this.f20812b.remove(cls);
            return this;
        }
    }

    public ProtobufEncoder(HashMap map, HashMap map2, a aVar) {
        this.f20808a = map;
        this.f20809b = map2;
        this.f20810c = aVar;
    }

    public final void a(ClientMetrics clientMetrics, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = this.f20809b;
        HashMap map2 = this.f20808a;
        ProtobufDataEncoderContext protobufDataEncoderContext = new ProtobufDataEncoderContext(byteArrayOutputStream, map2, map, this.f20810c);
        ObjectEncoder objectEncoder = (ObjectEncoder) map2.get(ClientMetrics.class);
        if (objectEncoder == null) {
            throw new EncodingException(androidx.datastore.preferences.protobuf.a.j(ClientMetrics.class, "No encoder for "));
        }
        objectEncoder.a(clientMetrics, protobufDataEncoderContext);
    }
}
