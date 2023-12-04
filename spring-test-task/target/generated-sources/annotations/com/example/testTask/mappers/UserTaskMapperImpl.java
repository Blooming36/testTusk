package com.example.testTask.mappers;

import com.example.testTask.dtos.UserDto;
import com.example.testTask.dtos.UserSmallDto;
import com.example.testTask.models.taskModels.UserTask;
import com.example.testTask.models.userModels.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T21:20:22+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class UserTaskMapperImpl implements UserTaskMapper {

    @Override
    public UserSmallDto toDTO(UserTask userTask) {
        if ( userTask == null ) {
            return null;
        }

        UserSmallDto userSmallDto = new UserSmallDto();

        userSmallDto.setUserExecutor( userToUserDto( userTask.getUserExecutor() ) );
        userSmallDto.setUserCreator( userToUserDto( userTask.getUserCreator() ) );
        userSmallDto.setStatus( userTask.getStatus() );
        userSmallDto.setHeading( userTask.getHeading() );
        userSmallDto.setDescription( userTask.getDescription() );
        userSmallDto.setPrioritie( userTask.getPrioritie() );

        return userSmallDto;
    }

    protected UserDto userToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setEmail( user.getEmail() );

        return userDto;
    }
}
