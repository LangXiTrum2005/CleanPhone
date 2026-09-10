package com.google.firebase.messaging.reporting;

import uniterm.saneness;

/* JADX INFO: loaded from: classes3.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final MessagingClientEvent f22705arytenoidectomy = new attabal().attabal();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final long f22706apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f22707attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f22708beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String f22709competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final String f22710cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f22711dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final Event f22712formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final String f22713impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f22714impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final String f22715kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final SDKPlatform f22716marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f22717saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f22718taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public final long f22719triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final MessageType f22720wireman;

    public enum Event implements saneness {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // uniterm.saneness
        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements saneness {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // uniterm.saneness
        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements saneness {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // uniterm.saneness
        public int getNumber() {
            return this.number_;
        }
    }

    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f22725attabal = 0;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f22735saneness = "";

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f22729dern = "";

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public MessageType f22738wireman = MessageType.UNKNOWN;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public SDKPlatform f22734marial = SDKPlatform.UNKNOWN_OS;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f22726beachfront = "";

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public String f22727competently = "";

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f22732impromptu = 0;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f22736taiyuan = 0;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public String f22728cutely = "";

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public long f22724apical = 0;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public Event f22730formularize = Event.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public String f22731impassible = "";

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public long f22737triweekly = 0;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public String f22733kowloon = "";

        public attabal apical(long j) {
            this.f22725attabal = j;
            return this;
        }

        public MessagingClientEvent attabal() {
            return new MessagingClientEvent(this.f22725attabal, this.f22735saneness, this.f22729dern, this.f22738wireman, this.f22734marial, this.f22726beachfront, this.f22727competently, this.f22732impromptu, this.f22736taiyuan, this.f22728cutely, this.f22724apical, this.f22730formularize, this.f22731impassible, this.f22737triweekly, this.f22733kowloon);
        }

        public attabal beachfront(String str) {
            this.f22729dern = str;
            return this;
        }

        public attabal competently(String str) {
            this.f22735saneness = str;
            return this;
        }

        public attabal cutely(int i) {
            this.f22732impromptu = i;
            return this;
        }

        public attabal dern(String str) {
            this.f22727competently = str;
            return this;
        }

        public attabal formularize(SDKPlatform sDKPlatform) {
            this.f22734marial = sDKPlatform;
            return this;
        }

        public attabal impassible(String str) {
            this.f22728cutely = str;
            return this;
        }

        public attabal impromptu(MessageType messageType) {
            this.f22738wireman = messageType;
            return this;
        }

        public attabal marial(Event event) {
            this.f22730formularize = event;
            return this;
        }

        public attabal saneness(String str) {
            this.f22731impassible = str;
            return this;
        }

        public attabal taiyuan(String str) {
            this.f22726beachfront = str;
            return this;
        }

        public attabal triweekly(int i) {
            this.f22736taiyuan = i;
            return this;
        }

        public attabal wireman(String str) {
            this.f22733kowloon = str;
            return this;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.f22707attabal = j;
        this.f22717saneness = str;
        this.f22711dern = str2;
        this.f22720wireman = messageType;
        this.f22716marial = sDKPlatform;
        this.f22708beachfront = str3;
        this.f22709competently = str4;
        this.f22714impromptu = i;
        this.f22718taiyuan = i2;
        this.f22710cutely = str5;
        this.f22706apical = j2;
        this.f22712formularize = event;
        this.f22713impassible = str6;
        this.f22719triweekly = j3;
        this.f22715kowloon = str7;
    }

    public static attabal arytenoidectomy() {
        return new attabal();
    }

    public int apical() {
        return this.f22714impromptu;
    }

    public String attabal() {
        return this.f22713impassible;
    }

    public Event beachfront() {
        return this.f22712formularize;
    }

    public String competently() {
        return this.f22711dern;
    }

    public String cutely() {
        return this.f22708beachfront;
    }

    public long dern() {
        return this.f22719triweekly;
    }

    public long formularize() {
        return this.f22707attabal;
    }

    public SDKPlatform impassible() {
        return this.f22716marial;
    }

    public String impromptu() {
        return this.f22717saneness;
    }

    public int kowloon() {
        return this.f22718taiyuan;
    }

    public String marial() {
        return this.f22715kowloon;
    }

    public long saneness() {
        return this.f22706apical;
    }

    public MessageType taiyuan() {
        return this.f22720wireman;
    }

    public String triweekly() {
        return this.f22710cutely;
    }

    public String wireman() {
        return this.f22709competently;
    }
}
