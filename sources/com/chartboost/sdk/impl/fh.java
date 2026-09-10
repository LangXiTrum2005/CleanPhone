package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public interface fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f13908a = c.f13918a;

    public enum a implements fh {
        IGNORED("cache_ignored"),
        START("cache_start"),
        FINISH_SUCCESS("cache_finish_success"),
        FINISH_FAILURE("cache_finish_failure"),
        GET_RESPONSE_PARSING_ERROR("cache_get_response_parsing_error"),
        BID_RESPONSE_PARSING_ERROR("cache_bid_response_parsing_error"),
        ASSET_DOWNLOAD_ERROR("cache_asset_download_error"),
        REQUEST_ERROR("cache_request_error"),
        SERVER_ERROR("cache_server_error");

        public static final /* synthetic */ EnumEntries m = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13914b;

        a(String str) {
            this.f13914b = str;
        }

        public static EnumEntries b() {
            return m;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13914b;
        }
    }

    public enum b implements fh {
        SUCCESS("click_success"),
        FAILURE("click_failure"),
        INVALID_URL_ERROR("click_invalid_url_error");

        public static final /* synthetic */ EnumEntries g = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13917b;

        b(String str) {
            this.f13917b = str;
        }

        public static EnumEntries b() {
            return g;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13917b;
        }
    }

    public enum d implements fh {
        SUBCLASSING_ERROR("consent_subclassing_error"),
        DECODING_ERROR("consent_decoding_error"),
        CREATION_ERROR("consent_creation_error"),
        PERSISTED_DATA_READING_ERROR("consent_persisted_data_reading_error"),
        PERSISTENCE_ERROR("consent_persistence_error");


        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13924i = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13925b;

        d(String str) {
            this.f13925b = str;
        }

        public static EnumEntries b() {
            return f13924i;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13925b;
        }
    }

    public enum e implements fh {
        IMPRESSION_TRACKER_FAILURE("imptracker_failure");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13927e = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13928b;

        e(String str) {
            this.f13928b = str;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13928b;
        }
    }

    public enum f implements fh {
        USER_AGENT_UPDATE_ERROR("user_agent_update_error"),
        PREFETCH_REQUEST_ERROR("prefetch_request_error"),
        CONFIG_REQUEST_ERROR("config_request_error"),
        INSTALL_REQUEST_ERROR("install_request_error"),
        IMPRESSION_RECORDED("impression_recorded"),
        UNSUPPORTED_OS_VERSION("unsupported_os_version"),
        TOO_MANY_EVENTS("too_many_events");

        public static final /* synthetic */ EnumEntries k = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13933b;

        f(String str) {
            this.f13933b = str;
        }

        public static EnumEntries b() {
            return k;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13933b;
        }
    }

    public enum g implements fh {
        SUCCESS("navigation_success"),
        FAILURE("navigation_failure");

        public static final /* synthetic */ EnumEntries f = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13936b;

        g(String str) {
            this.f13936b = str;
        }

        public static EnumEntries b() {
            return f;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13936b;
        }
    }

    public enum h implements fh {
        REQUEST_JSON_SERIALIZATION_ERROR("request_json_serialization_error"),
        RESPONSE_JSON_SERIALIZATION_ERROR("response_json_serialization_error"),
        RESPONSE_DATA_WRITE_ERROR("response_data_write_error"),
        DISPATCHER_EXCEPTION("network_failure_dispatcher_exception");


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f13939h = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13940b;

        h(String str) {
            this.f13940b = str;
        }

        public static EnumEntries b() {
            return f13939h;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13940b;
        }
    }

    public enum i implements fh {
        START("show_start"),
        FINISH_SUCCESS("show_finish_success"),
        FINISH_FAILURE("show_finish_failure"),
        UNAVAILABLE_ASSET_ERROR("show_unavailable_asset_error"),
        TIMEOUT_EVENT("show_timeout_error"),
        HTML_MISSING_MUSTACHE_ERROR("show_html_missing_mustache_error"),
        WEBVIEW_SSL_ERROR("show_webview_ssl_error"),
        WEBVIEW_ERROR("show_webview_error"),
        WEBVIEW_CRASH("show_webview_crash"),
        UNEXPECTED_DISMISS_ERROR("show_unexpected_dismiss_error"),
        REQUEST_ERROR("show_request_error"),
        CLOSE_BEFORE_TEMPLATE_SHOW_ERROR("show_close_before_template_show_error"),
        DISMISS_MISSING("dismiss_missing");

        public static final /* synthetic */ EnumEntries q = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13948b;

        i(String str) {
            this.f13948b = str;
        }

        public static EnumEntries b() {
            return q;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13948b;
        }
    }

    public enum j implements fh {
        FINISH_SUCCESS("video_finish_success"),
        FINISH_FAILURE("video_finish_failure");

        public static final /* synthetic */ EnumEntries f = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13951b;

        j(String str) {
            this.f13951b = str;
        }

        public static EnumEntries b() {
            return f;
        }

        @Override // com.chartboost.sdk.impl.fh
        public String getValue() {
            return this.f13951b;
        }
    }

    String getValue();

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ c f13918a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Lazy f13919b = LazyKt.b(a.f13920b);

        public static final class a extends Lambda implements Function0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f13920b = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                Object[][] objArr = {a.b().toArray(new a[0]), i.b().toArray(new i[0]), b.b().toArray(new b[0]), d.b().toArray(new d[0]), g.b().toArray(new g[0]), h.b().toArray(new h[0]), j.b().toArray(new j[0]), f.b().toArray(new f[0])};
                int length = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    length += objArr[i2].length;
                }
                ArrayList arrayList = new ArrayList(length);
                for (int i3 = 0; i3 < 8; i3++) {
                    CollectionsKt.h(arrayList, objArr[i3]);
                }
                return arrayList;
            }
        }

        public final List a(List values) {
            Intrinsics.f(values, "values");
            List listA = a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (values.contains(((fh) obj).getValue())) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final List a() {
            return (List) f13919b.getX();
        }
    }
}
