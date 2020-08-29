import React, {useState} from "react";
import Form from "react-bootstrap/Form";
import Button from "react-bootstrap/Button";
import { saveDummy } from "../service/DummyService";

function DummyCreator() {

    const [name, setName] = useState("");

    const submit = () => {
        console.log('name', name)
        saveDummy({name})
        setName("")
    }

  return (
    <Form >
        <Form.Group controlId="formGroupName">
            <Form.Label>Name</Form.Label>
            <Form.Control type="text" placeholder="Enter Dummy name" value={name} onChange={e => setName(e.target.value)}></Form.Control>
        </Form.Group>
        <Button variant="primary" onClick={submit}>Create</Button>
    </Form>
    );
}

export default DummyCreator;
