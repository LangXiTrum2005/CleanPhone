package org.jacoco.core.data;

import com.ironsource.X3;

/* JADX INFO: loaded from: classes5.dex */
public class SessionInfo implements Comparable<SessionInfo> {
    private final long dump;
    private final String id;
    private final long start;

    public SessionInfo(String str, long j, long j2) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.id = str;
        this.start = j;
        this.dump = j2;
    }

    public long getDumpTimeStamp() {
        return this.dump;
    }

    public String getId() {
        return this.id;
    }

    public long getStartTimeStamp() {
        return this.start;
    }

    public String toString() {
        return "SessionInfo[" + this.id + X3.j.e;
    }

    @Override // java.lang.Comparable
    public int compareTo(SessionInfo sessionInfo) {
        long j = this.dump;
        long j2 = sessionInfo.dump;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }
}
