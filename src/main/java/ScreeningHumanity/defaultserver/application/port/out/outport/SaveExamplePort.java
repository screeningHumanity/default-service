package ScreeningHumanity.defaultserver.application.port.out.outport;

import ScreeningHumanity.defaultserver.application.port.out.dto.ExampleDto;
import ScreeningHumanity.defaultserver.domain.Example;

public interface SaveExamplePort {

    ExampleDto SaveExample(Example example);
}
