package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {

    public static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RolloutAssignmentEncoder f21002a = new RolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21003b = FieldDescriptor.a("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21004c = FieldDescriptor.a("variantId");
        public static final FieldDescriptor d = FieldDescriptor.a("parameterKey");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f21005e = FieldDescriptor.a("parameterValue");
        public static final FieldDescriptor f = FieldDescriptor.a("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f21003b, rolloutAssignment.d());
            objectEncoderContext.f(f21004c, rolloutAssignment.f());
            objectEncoderContext.f(d, rolloutAssignment.b());
            objectEncoderContext.f(f21005e, rolloutAssignment.c());
            objectEncoderContext.b(f, rolloutAssignment.e());
        }
    }
}
