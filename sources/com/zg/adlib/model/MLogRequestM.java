package com.zg.adlib.model;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/zg/adlib/model/MLogRequestM;", "Lcom/zg/adlib/model/MBaseRequest;", "logs", "", "Lcom/zg/adlib/model/MLog;", "logstore", "", "project", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getLogs", "()Ljava/util/List;", "getLogstore", "()Ljava/lang/String;", "getProject", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MLogRequestM extends MBaseRequest {
    private final List<MLog> logs;
    private final String logstore;
    private final String project;

    public /* synthetic */ MLogRequestM(List list, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? "lie_detector_custom_event" : str, (i2 & 4) != 0 ? "android-client-event-1" : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MLogRequestM copy$default(MLogRequestM mLogRequestM, List list, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = mLogRequestM.logs;
        }
        if ((i2 & 2) != 0) {
            str = mLogRequestM.logstore;
        }
        if ((i2 & 4) != 0) {
            str2 = mLogRequestM.project;
        }
        return mLogRequestM.copy(list, str, str2);
    }

    public final List<MLog> component1() {
        return this.logs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLogstore() {
        return this.logstore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProject() {
        return this.project;
    }

    public final MLogRequestM copy(List<MLog> logs, String logstore, String project) {
        Intrinsics.f(logs, "logs");
        Intrinsics.f(logstore, "logstore");
        Intrinsics.f(project, "project");
        return new MLogRequestM(logs, logstore, project);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MLogRequestM)) {
            return false;
        }
        MLogRequestM mLogRequestM = (MLogRequestM) other;
        return Intrinsics.a(this.logs, mLogRequestM.logs) && Intrinsics.a(this.logstore, mLogRequestM.logstore) && Intrinsics.a(this.project, mLogRequestM.project);
    }

    public final List<MLog> getLogs() {
        return this.logs;
    }

    public final String getLogstore() {
        return this.logstore;
    }

    public final String getProject() {
        return this.project;
    }

    public int hashCode() {
        return this.project.hashCode() + a.b(this.logstore, this.logs.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MLogRequestM(logs=");
        sb.append(this.logs);
        sb.append(", logstore=");
        sb.append(this.logstore);
        sb.append(", project=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.project, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLogRequestM(List<MLog> logs, String logstore, String project) {
        super(null, null, null, null, null, null, null, 127, null);
        Intrinsics.f(logs, "logs");
        Intrinsics.f(logstore, "logstore");
        Intrinsics.f(project, "project");
        this.logs = logs;
        this.logstore = logstore;
        this.project = project;
    }
}
