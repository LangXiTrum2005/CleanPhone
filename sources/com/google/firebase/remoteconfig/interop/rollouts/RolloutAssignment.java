package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/* JADX INFO: loaded from: classes4.dex */
@Encodable
public abstract class RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataEncoder f21014a;

    public static abstract class Builder {
        public abstract RolloutAssignment a();

        public abstract Builder b(String str);

        public abstract Builder c(String str);

        public abstract Builder d(String str);

        public abstract Builder e(long j);

        public abstract Builder f(String str);
    }

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder rolloutAssignmentEncoder = AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.f21002a;
        jsonDataEncoderBuilder.b(RolloutAssignment.class, rolloutAssignmentEncoder);
        jsonDataEncoderBuilder.b(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
        f21014a = jsonDataEncoderBuilder.a();
    }

    public static Builder a() {
        return new AutoValue_RolloutAssignment.Builder();
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();
}
