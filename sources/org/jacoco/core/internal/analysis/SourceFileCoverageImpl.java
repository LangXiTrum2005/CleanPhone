package org.jacoco.core.internal.analysis;

import org.jacoco.core.analysis.ICoverageNode;
import org.jacoco.core.analysis.ISourceFileCoverage;

/* JADX INFO: loaded from: classes5.dex */
public class SourceFileCoverageImpl extends SourceNodeImpl implements ISourceFileCoverage {
    private final String packagename;

    public SourceFileCoverageImpl(String str, String str2) {
        super(ICoverageNode.ElementType.SOURCEFILE, str);
        this.packagename = str2;
    }

    @Override // org.jacoco.core.analysis.ISourceFileCoverage
    public String getPackageName() {
        return this.packagename;
    }
}
