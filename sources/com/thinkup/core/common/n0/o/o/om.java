package com.thinkup.core.common.n0.o.o;

import com.thinkup.core.common.n0.o.mn;
import com.thinkup.core.common.no.m.m0o;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes6.dex */
public final class om extends mn {
    private final m0o o;

    public om(m0o m0oVar) {
        this.o = m0oVar;
    }

    private InputStream o0() {
        m0o m0oVar = this.o;
        if (m0oVar != null) {
            return m0oVar.n().mo();
        }
        return null;
    }

    @Override // com.thinkup.core.common.n0.o.mn
    public final String m() {
        try {
            m0o m0oVar = this.o;
            return m0oVar != null ? m0oVar.o0() : null;
        } finally {
            m0o m0oVar2 = this.o;
            if (m0oVar2 != null) {
                m0oVar2.close();
            }
        }
    }

    @Override // com.thinkup.core.common.n0.o.mn
    public final String n() {
        try {
            StringBuilder sb = new StringBuilder();
            m0o m0oVar = this.o;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m0oVar != null ? m0oVar.n().mo() : null));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
            }
            return sb.toString();
        } finally {
            m0o m0oVar2 = this.o;
            if (m0oVar2 != null) {
                m0oVar2.close();
            }
        }
    }

    @Override // com.thinkup.core.common.n0.o.mn
    public final long o() {
        m0o m0oVar = this.o;
        if (m0oVar != null) {
            return m0oVar.m();
        }
        return 0L;
    }
}
