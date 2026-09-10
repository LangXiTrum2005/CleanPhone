package com.facebook.gamingservices.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/gamingservices/internal/TournamentSortOrder;", "", "facebook-gamingservices_release"}, k = 1, mv = {1, 5, 1})
public final class TournamentSortOrder {
    public static final /* synthetic */ TournamentSortOrder[] X = {new TournamentSortOrder("LowerIsBetter", 0), new TournamentSortOrder("HigherIsBetter", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    TournamentSortOrder EF5;

    public static TournamentSortOrder valueOf(String str) {
        return (TournamentSortOrder) Enum.valueOf(TournamentSortOrder.class, str);
    }

    public static TournamentSortOrder[] values() {
        return (TournamentSortOrder[]) X.clone();
    }
}
