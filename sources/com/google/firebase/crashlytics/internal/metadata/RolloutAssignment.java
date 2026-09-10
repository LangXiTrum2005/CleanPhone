package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/* JADX INFO: loaded from: classes4.dex */
@Encodable
public abstract class RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataEncoder f20411a;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder rolloutAssignmentEncoder = AutoRolloutAssignmentEncoder.RolloutAssignmentEncoder.f20379a;
        jsonDataEncoderBuilder.b(RolloutAssignment.class, rolloutAssignmentEncoder);
        jsonDataEncoderBuilder.b(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
        f20411a = jsonDataEncoderBuilder.a();
    }

    public static RolloutAssignment a(String str, String str2, String str3, String str4, long j) {
        if (str3.length() > 256) {
            str3 = str3.substring(0, 256);
        }
        return new AutoValue_RolloutAssignment(str, str2, str3, str4, j);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract String f();
}
