package androidx.room;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/FtsOptions;", "", "MatchInfo", "Order", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FtsOptions {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MatchInfo {
        public static final MatchInfo X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ MatchInfo[] f8178Y;
        public static final /* synthetic */ EnumEntries Z;

        /* JADX INFO: Fake field, exist only in values array */
        MatchInfo EF0;

        static {
            MatchInfo matchInfo = new MatchInfo("FTS3", 0);
            MatchInfo matchInfo2 = new MatchInfo("FTS4", 1);
            X = matchInfo2;
            MatchInfo[] matchInfoArr = {matchInfo, matchInfo2};
            f8178Y = matchInfoArr;
            Z = EnumEntriesKt.a(matchInfoArr);
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) f8178Y.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "room-common"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Order {
        public static final Order X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ Order[] f8179Y;
        public static final /* synthetic */ EnumEntries Z;

        static {
            Order order = new Order("ASC", 0);
            X = order;
            Order[] orderArr = {order, new Order("DESC", 1)};
            f8179Y = orderArr;
            Z = EnumEntriesKt.a(orderArr);
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f8179Y.clone();
        }
    }
}
