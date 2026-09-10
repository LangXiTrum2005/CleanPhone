package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {

    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RolloutAssignmentEncoder f20379a = new RolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20380b = FieldDescriptor.a("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20381c = FieldDescriptor.a("parameterKey");
        public static final FieldDescriptor d = FieldDescriptor.a("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20382e = FieldDescriptor.a("variantId");
        public static final FieldDescriptor f = FieldDescriptor.a("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20380b, rolloutAssignment.d());
            objectEncoderContext.f(f20381c, rolloutAssignment.b());
            objectEncoderContext.f(d, rolloutAssignment.c());
            objectEncoderContext.f(f20382e, rolloutAssignment.f());
            objectEncoderContext.b(f, rolloutAssignment.e());
        }
    }
}
