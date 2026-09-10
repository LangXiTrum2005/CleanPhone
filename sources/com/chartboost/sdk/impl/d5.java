package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d5 {

    public static final class a extends d5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f13679c;
        public final List d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final q4 f13680e;
        public final List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Integer num, List universalAdIds, q4 companionAds, List list) {
            super(null);
            Intrinsics.f(universalAdIds, "universalAdIds");
            Intrinsics.f(companionAds, "companionAds");
            this.f13677a = str;
            this.f13678b = str2;
            this.f13679c = num;
            this.d = universalAdIds;
            this.f13680e = companionAds;
            this.f = list;
        }

        public final q4 a() {
            return this.f13680e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.f13677a, aVar.f13677a) && Intrinsics.a(this.f13678b, aVar.f13678b) && Intrinsics.a(this.f13679c, aVar.f13679c) && Intrinsics.a(this.d, aVar.d) && Intrinsics.a(this.f13680e, aVar.f13680e) && Intrinsics.a(this.f, aVar.f);
        }

        public int hashCode() {
            String str = this.f13677a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f13678b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f13679c;
            int iHashCode3 = (this.f13680e.hashCode() + androidx.media3.extractor.text.ttml.a.c((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d)) * 31;
            List list = this.f;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.f13677a;
            String str2 = this.f13678b;
            Integer num = this.f13679c;
            List list = this.d;
            q4 q4Var = this.f13680e;
            List list2 = this.f;
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("CompanionCreative(id=", str, ", adId=", str2, ", sequence=");
            sbQ.append(num);
            sbQ.append(", universalAdIds=");
            sbQ.append(list);
            sbQ.append(", companionAds=");
            sbQ.append(q4Var);
            sbQ.append(", creativeExtensions=");
            sbQ.append(list2);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    public static final class b extends d5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f13681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f13682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f13683c;
        public final List d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ta f13684e;
        public final List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Integer num, List universalAdIds, ta linear, List list) {
            super(null);
            Intrinsics.f(universalAdIds, "universalAdIds");
            Intrinsics.f(linear, "linear");
            this.f13681a = str;
            this.f13682b = str2;
            this.f13683c = num;
            this.d = universalAdIds;
            this.f13684e = linear;
            this.f = list;
        }

        public final ta a() {
            return this.f13684e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.a(this.f13681a, bVar.f13681a) && Intrinsics.a(this.f13682b, bVar.f13682b) && Intrinsics.a(this.f13683c, bVar.f13683c) && Intrinsics.a(this.d, bVar.d) && Intrinsics.a(this.f13684e, bVar.f13684e) && Intrinsics.a(this.f, bVar.f);
        }

        public int hashCode() {
            String str = this.f13681a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f13682b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f13683c;
            int iHashCode3 = (this.f13684e.hashCode() + androidx.media3.extractor.text.ttml.a.c((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d)) * 31;
            List list = this.f;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            String str = this.f13681a;
            String str2 = this.f13682b;
            Integer num = this.f13683c;
            List list = this.d;
            ta taVar = this.f13684e;
            List list2 = this.f;
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("LinearCreative(id=", str, ", adId=", str2, ", sequence=");
            sbQ.append(num);
            sbQ.append(", universalAdIds=");
            sbQ.append(list);
            sbQ.append(", linear=");
            sbQ.append(taVar);
            sbQ.append(", creativeExtensions=");
            sbQ.append(list2);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    public d5() {
    }

    public /* synthetic */ d5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
