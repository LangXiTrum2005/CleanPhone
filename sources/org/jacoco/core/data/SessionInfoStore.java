package org.jacoco.core.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SessionInfoStore implements ISessionInfoVisitor {
    private final List<SessionInfo> infos = new ArrayList();

    public void accept(ISessionInfoVisitor iSessionInfoVisitor) {
        Iterator<SessionInfo> it = getInfos().iterator();
        while (it.hasNext()) {
            iSessionInfoVisitor.visitSessionInfo(it.next());
        }
    }

    public List<SessionInfo> getInfos() {
        ArrayList arrayList = new ArrayList(this.infos);
        Collections.sort(arrayList);
        return arrayList;
    }

    public SessionInfo getMerged(String str) {
        if (this.infos.isEmpty()) {
            return new SessionInfo(str, 0L, 0L);
        }
        long jMax = Long.MIN_VALUE;
        long jMin = Long.MAX_VALUE;
        for (SessionInfo sessionInfo : this.infos) {
            jMin = Math.min(jMin, sessionInfo.getStartTimeStamp());
            jMax = Math.max(jMax, sessionInfo.getDumpTimeStamp());
        }
        return new SessionInfo(str, jMin, jMax);
    }

    public boolean isEmpty() {
        return this.infos.isEmpty();
    }

    @Override // org.jacoco.core.data.ISessionInfoVisitor
    public void visitSessionInfo(SessionInfo sessionInfo) {
        this.infos.add(sessionInfo);
    }
}
