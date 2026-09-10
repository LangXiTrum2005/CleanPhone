package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/facebook/appevents/internal/SessionInfo;", "", "", "sessionStartTime", "sessionLastEventTime", "Ljava/util/UUID;", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;)V", "Lwj/r;", "incrementInterruptionCount", "()V", "writeSessionToDisk", "Ljava/lang/Long;", "getSessionStartTime", "()Ljava/lang/Long;", "getSessionLastEventTime", "setSessionLastEventTime", "(Ljava/lang/Long;)V", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "", "<set-?>", "interruptionCount", "I", "getInterruptionCount", "()I", "diskRestoreTime", "getDiskRestoreTime", "setDiskRestoreTime", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "sourceApplicationInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "getSourceApplicationInfo", "()Lcom/facebook/appevents/internal/SourceApplicationInfo;", "setSourceApplicationInfo", "(Lcom/facebook/appevents/internal/SourceApplicationInfo;)V", "getSessionLength", "()J", "sessionLength", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SessionInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";
    private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";
    private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";
    private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";
    private Long diskRestoreTime;
    private int interruptionCount;
    private UUID sessionId;
    private Long sessionLastEventTime;
    private final Long sessionStartTime;
    private SourceApplicationInfo sourceApplicationInfo;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/internal/SessionInfo$Companion;", "", "<init>", "()V", "Lcom/facebook/appevents/internal/SessionInfo;", "getStoredSessionInfo", "()Lcom/facebook/appevents/internal/SessionInfo;", "Lwj/r;", "clearSavedSessionFromDisk", "", "INTERRUPTION_COUNT_KEY", "Ljava/lang/String;", "LAST_SESSION_INFO_END_KEY", "LAST_SESSION_INFO_START_KEY", "SESSION_ID_KEY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void clearSavedSessionFromDisk() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.b()).edit();
            editorEdit.remove(SessionInfo.LAST_SESSION_INFO_START_KEY);
            editorEdit.remove(SessionInfo.LAST_SESSION_INFO_END_KEY);
            editorEdit.remove(SessionInfo.INTERRUPTION_COUNT_KEY);
            editorEdit.remove(SessionInfo.SESSION_ID_KEY);
            editorEdit.apply();
            SourceApplicationInfo.INSTANCE.clearSavedSourceApplicationInfoFromDisk();
        }

        public final SessionInfo getStoredSessionInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(s.b());
            long j10 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_START_KEY, 0L);
            long j11 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_END_KEY, 0L);
            String string = defaultSharedPreferences.getString(SessionInfo.SESSION_ID_KEY, null);
            if (j10 == 0 || j11 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j10), Long.valueOf(j11), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(SessionInfo.INTERRUPTION_COUNT_KEY, 0);
            sessionInfo.setSourceApplicationInfo(SourceApplicationInfo.INSTANCE.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(Long.valueOf(System.currentTimeMillis()));
            UUID uuidFromString = UUID.fromString(string);
            n.e(uuidFromString, "fromString(sessionIDStr)");
            sessionInfo.setSessionId(uuidFromString);
            return sessionInfo;
        }

        private Companion() {
        }
    }

    public SessionInfo(Long l, Long l10) {
        this(l, l10, null, 4, null);
    }

    public static final void clearSavedSessionFromDisk() {
        INSTANCE.clearSavedSessionFromDisk();
    }

    public static final SessionInfo getStoredSessionInfo() {
        return INSTANCE.getStoredSessionInfo();
    }

    public final Long getDiskRestoreTime() {
        Long l = this.diskRestoreTime;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long getSessionLength() {
        Long l;
        if (this.sessionStartTime == null || (l = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final void setDiskRestoreTime(Long l) {
        this.diskRestoreTime = l;
    }

    public final void setSessionId(UUID uuid) {
        n.f(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final void setSessionLastEventTime(Long l) {
        this.sessionLastEventTime = l;
    }

    public final void setSourceApplicationInfo(SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    public final void writeSessionToDisk() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(s.b()).edit();
        Long l = this.sessionStartTime;
        editorEdit.putLong(LAST_SESSION_INFO_START_KEY, l != null ? l.longValue() : 0L);
        Long l10 = this.sessionLastEventTime;
        editorEdit.putLong(LAST_SESSION_INFO_END_KEY, l10 != null ? l10.longValue() : 0L);
        editorEdit.putInt(INTERRUPTION_COUNT_KEY, this.interruptionCount);
        editorEdit.putString(SESSION_ID_KEY, this.sessionId.toString());
        editorEdit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo == null || sourceApplicationInfo == null) {
            return;
        }
        sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    }

    public SessionInfo(Long l, Long l10, UUID sessionId) {
        n.f(sessionId, "sessionId");
        this.sessionStartTime = l;
        this.sessionLastEventTime = l10;
        this.sessionId = sessionId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SessionInfo(Long l, Long l10, UUID uuid, int i10, g gVar) {
        if ((i10 & 4) != 0) {
            uuid = UUID.randomUUID();
            n.e(uuid, "randomUUID()");
        }
        this(l, l10, uuid);
    }
}
