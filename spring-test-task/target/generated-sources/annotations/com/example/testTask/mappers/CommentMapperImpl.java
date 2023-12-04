package com.example.testTask.mappers;

import com.example.testTask.dtos.CommentsDto;
import com.example.testTask.models.taskModels.Comment;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-04T21:20:22+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentsDto toDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentsDto commentsDto = new CommentsDto();

        commentsDto.setTextComments( comment.getTextComments() );

        return commentsDto;
    }
}
