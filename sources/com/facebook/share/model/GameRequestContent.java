package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new AnonymousClass1();
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f16610Y;
    public final ArrayList Z;
    public final String e0;
    public final String f0;
    public final ActionType g0;
    public final String h0;
    public final Filters i0;
    public final ArrayList j0;

    /* JADX INFO: renamed from: com.facebook.share.model.GameRequestContent$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<GameRequestContent> {
        @Override // android.os.Parcelable.Creator
        public final GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GameRequestContent[] newArray(int i2) {
            return new GameRequestContent[i2];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ActionType {
        public static final ActionType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final ActionType f16611Y;
        public static final /* synthetic */ ActionType[] Z;

        static {
            ActionType actionType = new ActionType("SEND", 0);
            X = actionType;
            ActionType actionType2 = new ActionType("ASKFOR", 1);
            f16611Y = actionType2;
            Z = new ActionType[]{actionType, actionType2, new ActionType("TURN", 2), new ActionType("INVITE", 3)};
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) Z.clone();
        }
    }

    public static class Builder implements ShareModelBuilder<GameRequestContent, Builder> {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Filters {
        public static final /* synthetic */ Filters[] X = {new Filters("APP_USERS", 0), new Filters("APP_NON_USERS", 1), new Filters("EVERYBODY", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Filters EF5;

        public static Filters valueOf(String str) {
            return (Filters) Enum.valueOf(Filters.class, str);
        }

        public static Filters[] values() {
            return (Filters[]) X.clone();
        }
    }

    public GameRequestContent(Parcel parcel) {
        this.X = parcel.readString();
        this.f16610Y = parcel.readString();
        this.Z = parcel.createStringArrayList();
        this.e0 = parcel.readString();
        this.f0 = parcel.readString();
        this.g0 = (ActionType) parcel.readSerializable();
        this.h0 = parcel.readString();
        this.i0 = (Filters) parcel.readSerializable();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.j0 = arrayListCreateStringArrayList;
        parcel.readStringList(arrayListCreateStringArrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f16610Y);
        parcel.writeStringList(this.Z);
        parcel.writeString(this.e0);
        parcel.writeString(this.f0);
        parcel.writeSerializable(this.g0);
        parcel.writeString(this.h0);
        parcel.writeSerializable(this.i0);
        parcel.writeStringList(this.j0);
    }
}
