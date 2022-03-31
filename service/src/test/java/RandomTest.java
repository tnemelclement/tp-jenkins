import org.junit.Test;
import service.RandomNumberProvider;

import static junit.framework.TestCase.assertEquals;

public class RandomTest {
    @Test
    public void maxRdmValTest() {
        RandomNumberProvider rd = new RandomNumberProvider(2);
        int result = rd.getRdm();
        assert result <= 2;
    }

}
