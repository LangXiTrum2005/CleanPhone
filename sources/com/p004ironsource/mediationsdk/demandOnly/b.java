package com.p004ironsource.mediationsdk.demandOnly;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b;", "", "a", "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$a;", "", "", "b", "I", "ERROR_LOAD_NO_FILL", "c", "ERROR_INSTANCE_LOAD_TIMEOUT", "d", "ERROR_INSTANCE_LOAD_EMPTY_BANNER", "e", "ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA", f.j, "ERROR_LOAD_ALREADY_IN_PROGRESS", g.f40227p, "ERROR_INSTANCE_LOAD_AUCTION_FAILED", h.f36614b, "ERROR_CODE_MISSING_CONFIGURATION", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25799a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int ERROR_LOAD_NO_FILL = 606;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_TIMEOUT = 608;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_BANNER = 610;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA = 618;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int ERROR_LOAD_ALREADY_IN_PROGRESS = 619;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_AUCTION_FAILED = 621;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final int ERROR_CODE_MISSING_CONFIGURATION = 1063;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$b;", "", "", "b", "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_CLICK", "e", "INSTANCE_SHOW", f.j, "INSTANCE_LOAD_ERROR", g.f40227p, "INSTANCE_LEAVE_APP", h.f36614b, "INSTANCE_DESTROY", i.f37957c, "INSTANCE_LOAD_NO_FILL", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0288b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0288b f25804a = new C0288b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int INSTANCE_LOAD = 3002;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 3005;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_CLICK = 3008;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int INSTANCE_SHOW = 3009;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_ERROR = 3300;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_LEAVE_APP = 3304;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final int INSTANCE_DESTROY = 3305;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final int INSTANCE_LOAD_NO_FILL = 3306;

        private C0288b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$c;", "", "", "b", "I", "TROUBLESHOOTING_INSTANCE_LOAD_FAILED", "c", "TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM", "d", "TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS", "e", "TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING", f.j, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST", g.f40227p, "TROUBLESHOOTING_INSTANCE_AUCTION_FAILED", h.f36614b, "TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS", i.f37957c, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL", "k", "TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25810a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_FAILED = 83300;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM = 83302;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS = 83305;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING = 83309;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST = 83500;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_FAILED = 83501;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS = 83502;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL = 83510;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL = 83511;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
