package facades.inter;

import dtos.AddressDTO;
import dtos.PersonDTO;
import dtos.ZipDTO;

import java.util.List;

public interface AddressFacadeInterface {

    AddressDTO create(AddressDTO address);

    AddressDTO edit(AddressDTO addressDTO);

    void delete(long id);

    AddressDTO getById(long id);

    List<AddressDTO> getAll();

    List<AddressDTO> getByZip(ZipDTO zipDTO);

    AddressDTO getByPerson(PersonDTO personDTO);

    long getAddressCount();
}
