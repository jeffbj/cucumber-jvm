package cucumber.api;

import java.util.Collection;

/**
 * Before or After Hooks that declare a parameter of this type will receive an instance of this class.
 * It allows writing text and embedding media into reports, as well as inspecting results (in an After block).
 */
public interface Scenario {
    Collection<String> getSourceTagNames();

    /**
     * @return the <em>most severe</em> status of the Scenario's Steps. One of "passed", "undefined", "pending", "skipped", "failed"
     */
    String getStatus();

    /**
     * @return true if and only if {@link #getStatus()} returns "failed"
     */
    boolean isFailed();

    /**
     * Embeds data into the report(s). Some reporters (such as the progress one) don't embed data, but others do (html and json).
     *
     * @param data     what to embed, for example an image.
     * @param mimeType what is the data?
     */
    void embed(byte[] data, String mimeType);

    /**
     * Outputs some text into the report.
     *
     * @param text what to put in the report.
     */
    void write(String text);
}
