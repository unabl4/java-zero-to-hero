package ee.itcollage.level13;

import java.util.List;

class AnalysisResult {

    private List<String> palidromes;
    private List<String> others;

    AnalysisResult(List<String> palidromes, List<String> others) {
        this.palidromes = palidromes;
        this.others = others;
    }

    public List<String> getPalidromes() {
        return palidromes;
    }

    public List<String> getOthers() {
        return others;
    }
}